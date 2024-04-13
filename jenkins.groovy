node {
    agent {label 'master'}
    stage('Checkout') {
         git branch: 'master', url: 'https://github.com/brad-jivedh/hello-world.git'
    }

    stage('Build') {
        sh 'mvn clean package'
    }
    stage('push') {
        echo 'This is Push Stage'
    }
    stage('deploy') {
        sh 'sudo mv /var/lib/jenkins/workspace/Que_4B/target/*.war /opt/apache-tomcat-9.0.87/webapps/'
    }
}
