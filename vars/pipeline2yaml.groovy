@Library('gitlib') _
import hudson.slaves.ComputerLauncher;

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
                    }
                    // println (it.getDisplayName().matches(/agent.label/) )
                    def agente = Jenkins.get().getDescriptorList(ComputerLauncher.class);
                    println "El agente existe: ${agente}"
                }
            }
        }
    }
}