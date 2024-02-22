#!/usr/bin/env groovy

def call(){
    sh '''
    cd java-app/ && /
    mvn clean test
    '''
}