#!/bin/sh

testMessage(){
  command=`bash test.sh`
  assertEquals "$command" 'Hello World!'
}

. shunit2-2.1.6/src/shunit2
