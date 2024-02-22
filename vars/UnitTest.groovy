#!/usr/bin/env groovy

def call(){
    sh '''
    docker run --rm -v /home/jenkins/jenkins/jenkins_home/workspace/EjercicioB5@libs/356783fcc28c80aec0c283bed886a5fb125ccbbb5f33642dd251b4a6c2fe6733/java-app:/app -v /var/jenkins_home/.m2:/root/.m2 -w /app maven:3-alpine mvn test
    '''
}