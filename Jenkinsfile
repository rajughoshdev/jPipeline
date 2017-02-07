node {
   stage 'Checkout'
   // Checkout code from repository
    checkout([$class: 'GitSCM', branches: [[name:'$BRANCH_NAME']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'a6c22567-3681-44da-b565-ae836d0da7e5', url: 'git@github.com:rajughoshdev/jPipeline.git']]])
}
