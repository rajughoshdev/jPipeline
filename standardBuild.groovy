def call(body) {
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    // This is where the magic happens - put your pipeline snippets in here, get variables from config.
    node {
        git 'https://github.com/rajughoshdev/docker-compose-workshop.git'
        sh 'cat Dockerfile'
   
    }
}
