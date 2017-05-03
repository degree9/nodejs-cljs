(ns nodejs-cljs.assert
  (:require [cljs.nodejs :as node]))

(def assert (node/require "assert"))

(defn deepEqual [actual expected & [msg]]
  (.deepEqual assert actual expected msg))

(defn deepStrictEqual [actual expected & [msg]]
  (.deepStrictEqual assert actual expected msg))

(defn doesNotThrow [block & [err msg]]
  (.doesNotThrow assert block err msg))

(defn equal [actual expected & [msg]]
  (.equal assert actual expected msg))

(defn fail [actual expected msg operator]
  (.fail assert actual expected msg operator))

(defn ifError [val]
  (.ifError assert val))

(defn notDeepEqual [actual expected & [msg]]
  (.notDeepEqual assert actual expected msg))

(defn notDeepStrictEqual [actual expected & [msg]]
  (.notDeepStrictEqual assert actual expected msg))

(defn notEqual [actual expected & [msg]]
  (.notEqual assert actual expected msg))

(defn notStrictEqual [actual expected & [msg]]
  (.notStrictEqual assert actual expected msg))

(defn ok [val & [msg]]
  (.ok assert val msg))

(defn strictEqual [actual expected & [msg]]
  (.strictEqual assert actual expected msg))

(defn throws [block & [err msg]]
  (.throws assert block err msg))
