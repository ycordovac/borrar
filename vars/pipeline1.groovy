pipeline {
    agent any
    options {
        timestamps()
        // habilitar el registro
        skipDefaultCheckout true
        buildDiscarder logRotator(numToKeepStr: '3')
    }
    stages {
        stage ('Firts Job') {
            steps {
                script{
                    println("Hola mundio")

                    // edades = [16,29,34,42,55]
                    // joven = 16..30
                    // assert edades.grep(joven) == [16,29]
                }
            }
        }
        stage ('Second Job') {
            steps {
                script {
                    def result = currentBuild.result
                    echo "El resultado del pipeline es: ${result}"
                }
            }
            post {
                success {
                    build job: 'pinga2', wait: true
                }
                failure {
                    println('failure pingaaaaaaaaaaaaaaaaaaaa')
                }
            }
        }
    }
}

