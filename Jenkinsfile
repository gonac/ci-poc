#!/usr/bin/groovy

// load pipeline functions
// Requires pipeline-github-lib plugin to load library from github

// @Library('github.com/gonac/ci-poc@test')

node () {

   properties([
  pipelineTriggers([
   [$class: 'GenericTrigger',
    genericVariables: [
     [key: 'ref', value: '$.ref'],
     [
      key: 'before',
      value: '$.before',
      expressionType: 'JSONPath', //Optional, defaults to JSONPath
      regexpFilter: '', //Optional, defaults to empty string
      defaultValue: '' //Optional, defaults to empty string
     ]
    ],
    genericRequestVariables: [
     [key: 'requestWithNumber', regexpFilter: '[^0-9]'],
     [key: 'requestWithString', regexpFilter: '']
    ],
    genericHeaderVariables: [
     [key: 'headerWithNumber', regexpFilter: '[^0-9]'],
     [key: 'headerWithString', regexpFilter: '']
    ],

    causeString: 'Triggered on $ref',

    token: 'abc123',

    printContributedVariables: true,
    printPostContent: true,

    silentResponse: false,

    regexpFilterText: '$ref',
    regexpFilterExpression: 'refs/heads/' + BRANCH_NAME
   ]
  ])
 ])

    // def pwd = pwd()

    checkout scm

    // Get services

    // Get changed services

    // read config for changed services


    stage ('init') {

    // read in required jenkins workflow config values
    def config = readJSON(file: 'Jenkinsfile.json')
    // def config = new groovy.json.JsonSlurperClassic().parseText(inputFile)
    println "pipeline config ==> ${config}"

    // continue only if pipeline enabled
    if (!config.pipeline.enabled) {
        println "pipeline disabled"
        // mark build as failed
        return
    }


    // If pipeline debugging enabled
    if (config.pipeline.debug) {
      println "DEBUG ENABLED"
      sh "env | sort"
    }

    }

    stage ('Lint') {


    }

    stage ('test') {


    }

    stage ('Sonar scan') {


    }

    stage ('Build and push image') {


    }

    stage ('Deploy') {


    }
  }