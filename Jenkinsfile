pipeline {
    agent any
    stages {
        stage('Build'){
            steps {
                cmd /C 'mvn clean package'
            }
            post {
                echo "Now Archiving..."
                archiveArtifacts artifacts: "**/target/*.war"
            }
        }
    }
}
