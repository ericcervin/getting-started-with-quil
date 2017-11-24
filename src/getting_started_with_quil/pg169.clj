(ns getting-started-with-quil.pg169
  (:require [quil.core :as q]
            [quil.middleware :as m]))
            

(defn setup []
  (let [file (slurp "images/ortiz.csv")
        lines (.split file "\n")
        home-runs (map #(nth (.split % ",") 1) lines)]        
       {:home-runs home-runs}))

(defn draw [state]
  (let [home-runs (:home-runs state)]
       (q/background 204)
        ;; Draw background grid for data)
       (q/stroke 255)
       (q/line 20 100 20 20)
       (q/line 20 100 460 100)
       (doseq [i (range (count home-runs))]
              (let [x  (q/map-range i 0  (dec (count home-runs)) 20 460)]
                   (q/line x 20 x 100)))
  
        ;; Draw lines based on home run data))
       (q/no-fill)
       (q/stroke 204 51 0)
       (q/begin-shape)
       (doseq [i (range (count home-runs))]
            (let [x  (q/map-range i 0  (dec (count home-runs)) 20 460)
                  y  (q/map-range (Integer. (nth home-runs i)) 0 60 100 20)]
                 (q/vertex x y)))
           
       (q/end-shape)))


(q/defsketch practice
  :size [480 120]
  :setup setup
  ;;:update update-state
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])


