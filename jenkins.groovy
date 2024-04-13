node {
  agent any
      stage('Checkout stage') {
        sh 'mvn --version'
     }
       stage('Build stage') {
        sh 'mvn clean install'
     }
       stage('Push stage') {
        echo "Pushin the build to tomcat"
     }
       stage('Deploy stage') {
         sh 'sudo mv /var/lib/jenkins/workspace/Que_4B/target/8.war /opt/apache-tomcat-9.0.87/webapps/'
  }
  }

