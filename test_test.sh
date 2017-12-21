#!/bin/sh

testMessage(){
  command='bash test.sh'
  assertEquals command "Hello World!"
}

. ./shunit2
