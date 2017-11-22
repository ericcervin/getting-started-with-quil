(ns getting-started-with-quil.pg161
  (:require [quil.core :as q]
            [quil.middleware :as m]))

(defn setup []
  {:current-frame 0
   :images (take 12 (map #(q/load-image (format "/images/frame-%04d.png" %)) (range 12)))})
    

(defn draw [state]
  (q/image (nth (:images state) (:current-frame state)) 0 0))

(defn update-state [state]
  (let [current-frame (inc (:current-frame state))]
    (assoc state :current-frame (if (>= current-frame (count (:images state))) 0
                                    current-frame))))

(q/defsketch practice
  :size [240 120]
  :setup setup
  :update update-state
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])
