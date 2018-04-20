node {
   try {
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
   if (currentBuild.currentResult == 'UNSTABLE') {
                currentBuild.result = "UNSTABLE"
            } else {
                currentBuild.result = "SUCCESS"
            }
            step([$class: 'InfluxDbPublisher', customData: null, customDataMap: null, customPrefix: null, customProjectName: "${JOB_NAME}", target: 'grafana'])
    } catch (Exception e) {
        currentBuild.result = "FAILURE"
        step([$class: 'InfluxDbPublisher', customData: null, customDataMap: null, customPrefix: null, customProjectName: "${JOB_NAME}", target: 'grafana'])
    }
}
