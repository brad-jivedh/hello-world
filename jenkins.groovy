node {
    
    stage('Checkout') {
        sh 'mvn --version'
    }

    stage('Build') {
        sh 'mvn clean package'
    }
    stage('push') {
        echo 'This is Push Stage'
    }
    stage('deploy') {
        sh 'sudo mv /var/lib/jenkins/workspace/Que_4B/target/8.war /opt/apache-tomcat-9.0.87/webapps/'
    }
}
