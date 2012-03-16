play-stylus
===========

[stylus] [1] asset handling for [Play 2.0] [2], implemented as an [sbt] [3]
plugin (very similar to Play's handling of CoffeeScript and LESS).

Prerequisites
-------------

The plugin assumes the availability of the `stylus` executable. With
node.js and npm installed, run

    npm install -g stylus

to install stylus globally, thereby installing not only the module, but
also the executable.

Installation
------------

In your Play application folder, add

    addSbtPlugin("learnyousome" % "play-stylus" % "0.1.0" from "http://cloud.github.com/downloads/knuton/play-stylus/play-stylus-0.1.0.jar")

to `project/plugins.sbt`.

The plugin automatically registers for compilation of `app/assets/**/*.styl`, that is all stylus files in your `app/assets` directory.

sbt settings
------------

  - `compile:resource-generators`: The stylus file watcher is beind added here
  - `play-stylus-entry-points`: All files matching `app/assets/**/*.styl`, except files starting in an underscore
  - `play-stylus-options`: Currently not in use

License
-------

Copyright (c) 2012 Johannes Emerich

MIT-style licensing, for details see file LICENSE.

[1]: http://learnboost.github.com/stylus/
[2]: http://www.playframework.org/
[3]: https://github.com/harrah/xsbt
