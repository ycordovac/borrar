@Library('gitlib') _

def scriptValues=scriptcallyaml

pipeline {
    agent none
    options {
        timestamps()
        skipDefaultCheckout true
        buildDiscarder logRotator(numToKeepStr: '3')
    }
    stages {
        stage ('Firts Job') {
            steps {
                script{
                    agent{
                        scriptallyaml
                        println('hola mundo')
                    }
                }
            }
        }
    }
}