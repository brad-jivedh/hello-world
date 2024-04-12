pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/brad-jivedh/hello-world.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn --version'
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
