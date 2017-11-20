(ns getting-started-with-quil.pg151
  (:require [quil.core :as q]
            [quil.middleware :as m]))

(defn setup []
  (q/no-stroke)
  (q/stroke 255 200)
  (take 3000 (repeatedly #(+ -1000 (rand 1200)))))
  

(defn update-state [state]
  (map #(+ % 0.5) state))

(defn draw [state]
  (println (q/current-frame-rate))
  (q/background 0)
  (doseq [i (range (count state))]
         (let [x (nth state i)
               y (* i 0.4)]
          (q/arc x y 12 12 0.52 5.76))))
    

(q/defsketch practice
  :size [240 120]
  :setup setup
  :update update-state
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])


