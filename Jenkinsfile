node {
   // Mark the code checkout 'stage'....
   stage 'Checkout'

   // Checkout code from repository
   checkout scm

   // Get the maven tool.
   // ** NOTE: This 'M3' maven tool must be configured
   // **       in the global configuration.
   stage 'build'

   echo "hello world"
   echo "$JOB_NAME"
   sh "echo ${env.BRANCH_NAME}"
   String []job = env.JOB_NAME.tokenize( '/'  )
   def branchName =job[1]
   //println "myjob = $JOB_NAME"
   if( branchName == "develop" || branchName == "master" || branchName=~/^[0-9]+.[0-9]+.[0-9]+-RC$/ ) {
     // notify Slack
   		println "send to product"
     }else{
   		println "send to devops"
     }
}
