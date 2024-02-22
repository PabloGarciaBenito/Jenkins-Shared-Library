#!/usr/bin/env groovy

def call(){
    sh '''
    docker run --rm -v /home/jenkins/jenkins/jenkins_home/workspace/Pipeline-Shared-Library/java-app:/app -v /var/jenkins_home/.m2:/root/.m2 -w /app maven:3-alpine mvn test
    '''
}