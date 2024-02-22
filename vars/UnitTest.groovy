#!/usr/bin/env groovy

def call(){
    sh '''
    cd java-app/ && /
    mvn test
    '''
}