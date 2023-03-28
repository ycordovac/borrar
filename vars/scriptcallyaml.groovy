def call() {
    def agent = readYaml(file: "${library.resourceUrl('helloWord.yaml')}")['agent']
    pipeline {
        agent { label agent.label }
    }
}