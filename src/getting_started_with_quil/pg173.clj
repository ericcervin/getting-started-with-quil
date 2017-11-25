(ns getting-started-with-quil.pg173
  (:require [quil.core :as q]
            [quil.middleware :as m]
            [clojure.data.json :as json]))

(defn setup []
  (let [file "images/film.json"
        film  (json/read-str (slurp file))
        title (get film "title")
        dir   (get film "director")
        year  (get film "year")
        rating (get film "rating")]
    (println (str title " by " dir ", " year))
    (println (str "Rating: " rating))))


(q/defsketch practice
  :size [480 120]
  :setup setup
  ;;:update update-state
  ;;:draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])


