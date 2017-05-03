(ns nodejs-cljs.os
  (:require [cljs.nodejs :as node]
            [goog.object :as obj]))

(def os (node/require "os"))

(defn EOL []
  (obj/get os "EOL"))

(defn arch []
  (.arch os))

(defn constants []
  (obj/get os "constants"))

(defn cpus []
  (.cpus os))

(defn endianness []
  (.endianness os))

(defn freemem []
  (.freemem os))

(defn homedir []
  (.homedir os))

(defn hostname []
  (.hostname os))

(defn loadavg []
  (.loadavg os))

(defn networkInterfaces []
  (.networkInterfaces os))

(defn platform []
  (.platform os))

(defn release []
  (.release os))

(defn tmpdir []
  (.tmpdir os))

(defn totalmem []
  (.totalmem os))

(defn type []
  (.type os))

(defn uptime []
  (.uptime os))

(defn userInfo [& [opts]]
  (.userInfo os opts))
