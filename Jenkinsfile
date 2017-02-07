node {
   // Mark the code checkout 'stage'....
   stage 'Checkout'

   // Checkout code from repository
  checkout([$class: 'GitSCM', branches: [[name:'$BRANCH_NAME']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'a6c22567-3681-44da-b565-ae836d0da7e5', url: 'git@github.com:rajughoshdev/jPipeline.git']]]) 
   // Get the maven tool.
   // ** NOTE: This 'M3' maven tool must be configured
   // **       in the global configuration.
}
