(ns getting-started-with-quil.pg174
  (:require [quil.core :as q]
            [quil.middleware :as m]
            [clojure.data.json :as json]))

(defn setup []
  (let [file "images/films.json"
        film-map  (json/read-str (slurp file))]
    film-map))               
               
(defn display-film [m, x, y]
  (let [rating-gray (q/map-range (get m "rating") 6.5 8.1 102 255)]
    (q/push-matrix)
    (q/translate x y)
    (q/rotate (* -1 q/QUARTER-PI))
    (q/fill rating-gray)
    (q/text (get m "title") 0 0)
    (q/pop-matrix)))

(defn draw [state]
  (q/background 0)
  (doseq [i (range (count state))]
    (let [x (+ (* i 32) 32)]
        (display-film (nth state i) x 105))))
    
  

(q/defsketch practice
  :size [480 120]
  :setup setup
  ;;:update update-state
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])


