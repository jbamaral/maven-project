pipeline {
    agent any
    triggers {
         pollSCM('* * * * *')
    }
    stages{
        stage('Build'){
            steps {
                sh 'mvn clean package'
            }
            post {
                success {
                    echo 'Now Archiving...'
                    archiveArtifacts artifacts: '**/target/*.war'
                }
            }
        }

        stage ('Deployments'){
            parallel{
                stage ('Deploy to Staging'){
                    build job: 'deploy-to-staging'
                }

                stage ("Deploy to Production"){
                    timeout(time:5, unit:'DAYS') {
                        input message: 'Approve PRODUCTION Deployment?'
                    }
                    build job: 'deploy-to-Prod'
                }
            }
        }
    }
}
