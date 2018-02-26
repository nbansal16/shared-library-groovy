#!/usr/bin/env groovy

package org.foo

def sayHel(String name = 'human') {
  echo "Hello, ${name}."
}
