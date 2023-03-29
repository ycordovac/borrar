@Library('jenkins-library') _

pipeline { 
    agent {
        String cloud = 'kubernetes'
        label 'kk'
        def ret = [:]

        def agentCreator = renderTemplateText(templatePath:'./templates/agent.tpl',
            tokens: [
                imageName: config.imageName,
                credentialSecret: config.credentialSecret
            ])

        ret['cloud'] = cloud
        ret['yaml'] = agentCreator
    }
    
    environment {
        ACR_NAME = credentials('acr-name-platform')
        SECRET   = credentials('platform-acr-secret-name')
    }
    
    stages { 
        stage('Main') { 
            agent {
                kubernetes( containerCall(imageName: ACR_NAME, credentialSecret: SECRET))
            } 
            steps { 
                container('aks') { 
                    sh "az version"
                } 
            } 
        } 
        stage('Main2') { 
            agent {
                kubernetes( containerCall(imageName: ACR_NAME, credentialSecret: SECRET))
            }
            steps {
                container('aks') {
                    sh "az version || echo 'sin AKS'" 
                }
            } 
        } 
        
    } 
}
