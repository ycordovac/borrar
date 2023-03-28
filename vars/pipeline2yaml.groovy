@Library('gitlib') _

pipeline {
    scriptcallyaml()
    options {
        timestamps()
        skipDefaultCheckout true
        buildDiscarder logRotator(numToKeepStr: '3')
    }
    stages {
        stage ('Firts Job') {
            steps {
                script{
                    println('hola mundo')
                }
            }
        }
    }
}