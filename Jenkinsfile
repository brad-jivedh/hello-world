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
                sh 'rsync  /var/lib/jenkins/workspace/Que_3/target/*.war ubuntu@13.234.33.170:/opt/apache-tomcat-9.0.87/webapps/'
      
            }
        }

    }
}
