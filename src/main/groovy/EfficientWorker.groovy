package pps

import pps.worker.Worker

class EfficientWorker implements Worker {
    Worker worker
    Integer coeff

    @Override
    void work() {
        coeff.times { worker.work() }
    }
}
