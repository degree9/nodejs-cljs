(set-env!
 :dependencies  '[[org.clojure/clojure                 "1.8.0"]
                  [boot/core                           "2.7.1"]
                  [adzerk/bootlaces                    "0.1.13" :scope "test"]
                  [degree9/boot-semver                 "1.4.4"  :scope "test"]]
 :resource-paths   #{"src"})

(require
 '[adzerk.bootlaces    :refer :all]
 '[degree9.boot-semver :refer :all])

(task-options!
  pom    {:project 'degree9/nodejs-cljs
          :description "Node.js API integration for CLJS."
          :url         "https://github.com/degree9/nodejs-cljs"
          :scm         {:url "https://github.com/degree9/nodejs-cljs"}}
  target {:dir #{"target"}})

(deftask develop
  "Build nodejs-cljs for development."
  []
  (comp
   (watch)
   (version :develop true
            :minor 'inc
            :patch 'zero
            :pre-release 'snapshot)
   (target)
   (build-jar)))

(deftask deploy
  "Build nodejs-cljs and deploy to clojars."
  []
  (comp
   (version)
   (target)
   (build-jar)
   (push-release)))
