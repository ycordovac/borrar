def call(Map pipelineParams){
    pipeline {
        agent any
        stages {
            stage ('Firts Job') {
                steps {
                    echo "Primer Trabajo"
                    script{
                        println(pipelineParams.imprimir)
                        person.printName()
                    }
                }
            }
        }
    }
}