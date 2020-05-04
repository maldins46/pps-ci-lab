package pps

import java.util.Set;
import pps.worker.Worker
/**
 * Nardini is an oppressor which exploits his slaves to pursue his interest.
 */
class Nardini(val slave: Set<Worker>): Worker {
    override fun work() {
        slave.forEach { it.work() }
    }
}