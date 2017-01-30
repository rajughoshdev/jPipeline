
def call(body) {
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()
    stage 'checkout'
    node {
	    stage('Build') { // <2>
		echo "build success"
   	 }
    	stage('Test') {
     	 echo "test success"
    	}
    	stage('Deploy') {
     	 echo "Deploy success"
   	 }
   }
}
