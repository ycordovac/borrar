pipeline {
    agent { label 'etiqueta' }
    stages {
        stage('build') {
            agent { label 'etiqueta' }
            steps {
                echo "build"
                sh "ls -lrt && touch build.txt"
            }
        }
        stage('test') {
            parallel {
                stage('unit tests') {
                    steps {
                        echo "unit tests"
                        sh "ls -lrt && touch ut.txt"
                        sleep(time:10,unit:"SECONDS")
                    }
                }
                stage('integration tests') {
                    steps {
                        echo "integration tests"
                        sh "ls -lrt && touch it.txt"
                        sleep(time:10,unit:"SECONDS")
                    }
                }
            }
        }
        stage('deploy staging') {
            agent { label 'etiqueta' }
            steps {
                echo "deploy staging"
                sh "ls -lrt && touch dep.txt"
            }
        }
        stage('confirm release') {
            agent { label 'etiqueta' }
            steps {
                echo "RELEASE?"
                sh "ls -lrt && touch release.txt"
            }
        }
        stage('deploy production') {
            steps {
                echo "deploy production"
                sh "ls -lrt && touch produ.txt"
            }
        }
    }
}