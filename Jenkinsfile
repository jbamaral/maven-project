pipeline {
    agent any
    stages{
        stage('Build'){
            steps {
                bat 'mvn clean package'
                bat 'docker build . -t tomcatwebapp:${env.BUILD_ID}'
            }
            /*
            post {
                success {
                    echo 'Now Archiving...'
                    archiveArtifacts artifacts: '** /target/*.war'
                }
            }
            */
        }
        /*
        stage ('Deployments'){
            parallel{
                stage ('Deploy to Staging'){
                    steps {
                        build job: 'deploy-to-staging'
                    }
                }

                stage ("Deploy to Production"){
                    steps {
                        timeout(time:5, unit:'DAYS') {
                            input message: 'Approve PRODUCTION Deployment?'
                        }
                        build job: 'deploy-to-Prod'
                    }
                }
            }
        }
        */
    }
    
}
