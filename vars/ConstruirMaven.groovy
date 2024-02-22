#!/usr/bin/env groovy

def call(){
    sh '''
    cd ../Pipeline-Shared-Library@libs/356783fcc28c80aec0c283bed886a5fb125ccbbb5f33642dd251b4a6c2fe6733/java-app/ && /
    mvn -B -DskipTests clean package
    '''
}