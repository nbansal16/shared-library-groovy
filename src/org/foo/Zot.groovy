package org.foo;

def checkOutFrom(repo) {
  git url: "git@github.com:nbansal16/${repo}"
}

return this
