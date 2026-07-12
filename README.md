edn-js-bridge
=============

A VERY simple library that converts edn strings to javascript objects, and back. Nothing more, nothing less.

The [edn-data](https://github.com/jorinvo/edn-data) library has more options than this one. The only reason you might want to consider this library is because it uses the actual ClojureScript `clj->js`, `js->clj`, and `read` functions, rather than a reimplementation in javascript.

This library provides only two functions:

```
export function parseEDNString(str: string): object;
export function toEDNString(obj: object, keywordize?: boolean): string;
```

Note that [edn-to-js](https://github.com/machellerogden/edn-to-js) has a similar goal, but its use of `fs` makes it more suited to Node...I think.

# Usage

```
> var ednjs = require('ednjs');
> ednjs.parseEDNString('{:hello "world"}')
{ hello: 'world' }
```

# Warnings

This library is NOT meant to be particularly scalable. It has all of the same limitations that `clj->js` has.
