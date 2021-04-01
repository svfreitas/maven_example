pipeline {
    agent {
         label 'java-docker-slave'
    }
    stages {
        stage("clone sources") {
            steps {
                    // Let's clone the source
                    git url: 'https://github.com/svfreitas/maven_example.git', branch: 'main'
               }
        }
        stage ("build")
        {
            steps {
                sh "mvn package -DskipTests=true"
            }
        } 
        stage('Test') { 
            steps {
                sh 'mvn test' 
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml' 
                }
            } 
        }
    }
    post {
        always {
            archiveArtifacts artifacts: '**/maven-simple-*-SNAPSHOT*.jar', onlyIfSuccessful: true
        }
    }
}
