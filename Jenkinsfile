pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'mvn --version'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Push') {
            steps {
                echo 'This is Push Stage'
            }
        }

        stage('Deploy') {
            steps {
                sh 'rsync  /var/lib/jenkins/workspace/tomcat/target/*.war ubuntu@52.66.210.6:/opt/tomcat/webapps/'
      
            }
        }

    }
}
