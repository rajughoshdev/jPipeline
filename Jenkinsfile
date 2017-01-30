#!groovy
node {
	  stage('Build') { // <2>
	   echo "Running ${currentBuild.displayName} on ${env.BUILD_ID} and ${env.JOB_NAME} and ${env.JOB_URL} on ${env.JENKINS_URL}"
   	 }
  
    stage('Test') {
     	 echo "test success"
    	}

    stage('Deploy') {
     	 echo "Deploy success"
   	 }
}
