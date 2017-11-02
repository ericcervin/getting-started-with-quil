(ns getting-started-with-quil.p69
  (:require [quil.core :as q]
            [quil.middleware :as m]))
            
(defn setup []
  {})  
 
(defn update-state[state]
  state)
                                
(defn draw [state]
  (q/background 204)
  (if (q/key-pressed?)
      (let [srk (str (q/raw-key))]
       (if (or (= srk "h") (= srk "H")) (q/line 30 60 90 60))
       (if (or (= srk "n") (= srk "N")) (q/line 30 20 90 100))))
  (q/line 30 20 30 100)
  (q/line 90 20 90 100)
  )
    
(q/defsketch practice
  :size [120 120]
  :setup setup
  :update update-state
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])

