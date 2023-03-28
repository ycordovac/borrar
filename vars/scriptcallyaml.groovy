def call() {
    agent { readYaml(file: "${library.resourceUrl('org.foot.helloWord.yaml')}")['agent'] }
}
