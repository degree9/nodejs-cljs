(ns nodejs-cljs.string-decoder
  (:require [cljs.nodejs :as node]
            [goog.object :as obj]))

(defn string-decoder [encoding]
  (.StringDecoder (node/require "string_decoder") encoding))

(defn escape [sd s]
  (.escape string-decoder s))

(defn end [sd b]
  (.end sd b))

(defn write [sd b]
  (.write sd b))
