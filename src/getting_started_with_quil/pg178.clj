(ns getting-started-with-quil.pg178
  (:require [quil.core :as q]
            [quil.middleware :as m]
            [clojure.data.json :as json]))

(defn get-temp [file-name]
     (let [weather  (json/read-str (slurp file-name))
           list     (get weather "list")
           item     (nth list 0)
           temperature (get-in item ["main" "temp"])]
       temperature))


(defn setup []
  (let [temp (get-temp "images/cincinnati.json")]
    (println temp)))


(q/defsketch practice
  :size [100 100]
  :setup setup
  ;;:update update-state
  ;;:draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])
