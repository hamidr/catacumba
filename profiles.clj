{:dev
 {:global-vars {*warn-on-reflection* false}
  :source-paths ["src"]
  :codeina {:sources ["src/clojure"]
            :exclude [catacumba.impl.context
                      catacumba.impl.atomic
                      catacumba.impl.executor
                      catacumba.impl.stream
                      catacumba.impl.stream.common
                      catacumba.impl.stream.channel
                      catacumba.impl.stream.promise
                      catacumba.impl.stream.pushstream
                      catacumba.impl.handlers
                      catacumba.impl.server
                      catacumba.impl.http
                      catacumba.impl.routing
                      catacumba.impl.stream
                      catacumba.impl.websocket
                      catacumba.impl.sse
                      catacumba.handlers.cors
                      catacumba.handlers.auth
                      catacumba.handlers.autoreload
                      catacumba.handlers.parsing
                      catacumba.handlers.security
                      catacumba.handlers.session
                      catacumba.handlers.interceptor]
            :reader :clojure
            :target "doc/dist/latest/api"
            :src-uri "http://github.com/funcool/catacumba/blob/master/"
            :src-uri-prefix "#L"}
  :plugins [[funcool/codeina "0.2.0"]
            [lein-ancient "0.6.7" :exclusions [org.clojure/tools.reader]]]
  :dependencies [[clj-http "1.1.2"]
                 [aleph "0.4.0" :exclusions [io.netty/netty-all]]
                 [org.clojure/tools.namespace "0.2.11"]
                 [ring/ring-core "1.4.0"
                  :exclusions [javax.servlet/servlet-api clj-time org.clojure/clojure]]]}
 ;; Examples
 :examples
 {:dependencies [[cheshire "5.5.0"]
                 [hiccup "1.0.5"]]}

 :websocket-echo-example
 [:examples
  {:source-paths ["examples/websocket-echo/src"]
   :resource-paths ["examples/websocket-echo/resources"]
   :main ^:skip-aot websocket-echo.core}]

 :component-chat-example
 [:examples
  {:source-paths ["examples/component-chat/src"]
   :resource-paths ["examples/component-chat/resources"]
   :main ^:skip-aot compchat.core}]

 :debugging-example
 [:examples
  {:dependencies [[prone "0.8.2"]]
   :source-paths ["examples/debugging/src"]
   :resource-paths ["examples/debugging/resources"]
   :main ^:skip-aot debugging.core}]

 :interceptor-example
 [:examples
  {:source-paths ["examples/interceptor/src"]
   :resource-paths ["examples/interceptor/resources"]
   :main ^:skip-aot interceptor.core}]

 :website-example
 [:examples
  {:source-paths ["examples/website/src"]
   :resource-paths ["examples/website/resources"]
   :main ^:skip-aot website.core}]

 }

