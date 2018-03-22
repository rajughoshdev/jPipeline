node {
   // Mark the code checkout 'stage'....
   stage 'Checkout'

   // Checkout code from repository
   checkout([$class: 'GitSCM', branches: [[name: '*/${BRANCH_NAME}']], doGenerateSubmoduleConfigurations: false, extensions: [[$class: 'GitLFSPull']], submoduleCfg: [], userRemoteConfigs: url: [[url: 'https://github.com/rajughoshdev/${JOB_NAME}.git']]])

   // Get the maven tool.
   // ** NOTE: This 'M3' maven tool must be configured
   // **       in the global configuration.
}
