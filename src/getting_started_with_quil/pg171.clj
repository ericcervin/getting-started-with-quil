(ns getting-started-with-quil.pg171
  (:require [quil.core :as q]
            [quil.middleware :as m]))
      
(defn set-xy [lat lng]
  (let [x (q/map-range lng -180 180 0 (q/width))
        y (q/map-range lat 90 -90 0 (q/height))]
    (q/point x y)))

(defn setup []
  (q/stroke 255)
  (let [file (slurp "images/cities.csv")
        lines (.split file "\n")
        cities (map #(.split % ",") lines)]
    
    {:cities cities}))
        

(defn draw [state]
  (q/background 0  26  51)
  (let [cities (:cities state)
        wth (q/width)
        xoffset  (q/map-range (q/mouse-x) 0  wth (* -3 wth) (* -1 wth))]
      
       (q/translate xoffset -300)
       (q/scale 10)
       (q/stroke-weight 0.1)
       (doseq [i (range 1 (count cities))]
         (let [latitude (Float. (nth (nth cities i) 3));
               longitude (Float. (nth (nth cities i) 4))];
              (set-xy latitude longitude)))))
        

(q/defsketch practice
  :size [480 120]
  :setup setup
  ;;:update update-state
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])


