def call() {
    def agent = readYaml(file: "${library.resourceUrl('org.foot.helloWord.yaml')}")['agent']
    pipeline {
        agent { label agent.label }
    }
    script {
        println('from call def')
    }
}