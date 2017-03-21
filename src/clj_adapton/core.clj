(ns clj-adapton.core)

(defn make-athunk [thunk]
  {:thunk thunk 
   :result (atom 'empty) 
   :sub (atom ())
   :super (atom ())
   :clean false})




